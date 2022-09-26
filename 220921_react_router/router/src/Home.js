import Header from "./Header";
import Footer from "./Footer";

function Home(){
    let name  = 'this is variable';
    return(
        <body>
            <Header/>
            <div>
                <h1>Welcome!</h1>
                <p>This is my first react app!</p>
            </div>
            <Footer/>
        </body>
    )
}
//export the function to use in other component
export default Home;