import './App.css';
import Header from "./Header";
import Footer from "./Footer";

const Logout = () => {
    /* 1. Show and hide the logout using localstorage in header component. */

    const login = () => {
        localStorage.setItem("username","cheyanne");
        window.location.reload(false);
    }

    const logout = () => {
        localStorage.clear();
        window.location.reload(false);
    }

    return(
        <body>
            <Header/>

            <h1>Logout</h1>

            <div>
                <button onClick={login}>Login (show in header)</button>
                <br/><br/>
                <button onClick={logout}>Logout (hide from header)</button>
            </div>

            <Footer/>
        </body>
    )
}

//export the function to use in other component
export default Logout;