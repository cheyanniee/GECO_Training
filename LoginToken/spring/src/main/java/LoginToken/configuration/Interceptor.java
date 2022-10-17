package LoginToken.configuration;

import LoginToken.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class Interceptor implements HandlerInterceptor {
    @Autowired
    UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try{
            if (request.getMethod().equals("OPTIONS")){
                return true;
            }

            String current_url = request.getRequestURL().toString();
            System.out.println("current url: " + current_url);
            if (current_url.endsWith("userLogin") || current_url.endsWith("userRegister") || current_url.contains("readImage")){
                System.out.println("excluded url: " + current_url);
                return true;
            }

            String token = request.getHeader("token");
            String userID = request.getHeader("userid");

            if (token == null || token.equals("")){
                throw new Exception("Invalid token");
            }
            if (userID == null || userID.equals("")){
                throw new Exception("Invalid user");
            }


            userService.validateToken(token);
            return true;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }




    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }


    //after sending the response.
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
