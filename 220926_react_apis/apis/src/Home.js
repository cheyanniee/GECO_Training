import Header from "./Header";
import Footer from "./Footer";

function Home(){
    return(
        <body>
                    <Header/>
                    <div>
                        <h1>26 September 2022</h1>

                        <p>
                            <a href='./post'>Post</a>
                            <br/>
                            1. Call the post API from react button click with react state.
                        </p>

                        <p>
                            <a href='./condition'>Condition</a>
                            <br/>
                            2. Conditional class. Create array of object with name and age.
                            <br/>
                            If age > 50, highlight in red.
                        </p>

                        <p>
                            <a href='./users'>Users</a>
                            <br/>
                            3. Call the get api and show first name and his image (avatar).
                            <br/>
                            Click the the user detail and show email, firstName, lastname, id, image separately in the page.
                        </p>
                    </div>
                    <Footer/>
                </body>
    )
}
//export the function to use in other component
export default Home;