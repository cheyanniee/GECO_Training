import Header from "./Header";
import Footer from "./Footer";

function Contact(){
    return (

        <body>
            <Header/>

            <div id="body" className="contact">
                <div className="header">
                    <div>
                        <h1>Contact</h1>
                    </div>
                </div>
                <div className="body">
                    <div>
                        <div>
                            <img src="images/check-in.png" alt="" />
                            <h1>UNIT 0123 , ABC BUILDING, BUSSINESS PARK</h1>
                            <p>If you're having problems editing this website template, then don't hesitate to ask for help on the Forums.</p>
                        </div>
                    </div>
                </div>
                <div className="footer">
                    <div className="contact">
                        <h1>INQUIRY FORM</h1>
                        <form action="home">
                            <input type="text" name="Name" defaultValue="Name" onblur="this.value=!this.value?'Name':this.value;" onfocus="this.select()" onclick="this.value='';" />
                            <input type="text" name="Email" defaultValue="Email" onblur="this.value=!this.value?'Email':this.value;" onfocus="this.select()" onclick="this.value='';" />
                            <input type="text" name="Subject" defaultValue="Subject" onblur="this.value=!this.value?'Subject':this.value;" onfocus="this.select()" onclick="this.value='';" />
                            <textarea name="meassage" cols={50} rows={7} defaultValue={"Share your thoughts"} />
                            <input type="submit" defaultValue="Send" id="submit" />
                        </form>
                    </div>
                    <div className="section">
                        <h1>WE’D LOVE TO HEAR FROM YOU.</h1>
                        <p>If you're having problems editing this website template, then don't hesitate to ask for help on the Forums.</p>
                    </div>
                </div>
            </div>

            <Footer/>
        </body>
    )
}

export default Contact;