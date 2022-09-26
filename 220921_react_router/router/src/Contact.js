import Header from "./Header";
import Footer from "./Footer";
import './App.css';

function Contact(){
    return(
        <body>
            <Header/>
            <h1 >Contact Us</h1>
            <div className="contactForm">
                <textarea id='queryInput' placeholder="Type Here"></textarea>
            </div>
            <div>
                <button className="btn" type="submit">Submit</button>
            </div>
            
            <Footer/>
        </body>
    )
}
//export the function to use in other component
export default Contact;