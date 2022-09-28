import Header from "./Header";
import Footer from "./Footer";

function Home(){
    return(
        <body>
            <Header/>
            <div>
                <h1>27 September 2022</h1>

                <p>
                    Highlight the menu based on the current page.
                </p>

                <p>
                    <a href='./logout'>Logout</a>
                    <br/>
                    1. Show and hide the logout using localstorage in header component.
                </p>

                <p>
                    <a href='./get'>Get</a>
                    <br/>
                    2. Create class component.
                    <br/>
                    2.1 Call the server with get api.
                </p>

                <p>
                    <a href='./post'>Post</a>
                    <br/>
                    3. Create class component.
                    <br/>
                    3.1 Call the server with post api.
                </p>

                <p>
                    <a href='./condition'>Condition</a>
                    <br/>
                    4. Create class component.
                    <br/>
                    4.1 Conditional style in class component using array of objects.
                </p>
            </div>
            <Footer/>
        </body>
    )
}
//export the function to use in other component
export default Home;