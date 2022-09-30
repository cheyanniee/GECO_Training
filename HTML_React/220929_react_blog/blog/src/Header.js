import './App.css'

function Header(){
    return(
        <body>
            <div id="page">
                <div id="header">
                    <div>
                        <a href="home" className="logo"><img src="images/logo.png" alt="" /></a>
                        <ul id="navigation">
                            <li className={window.location.pathname == "/home"?"selected":""}>
                                <a href="home">Home</a>
                            </li>
                            <li className={window.location.pathname == "/about"?"menu selected":"menu"}>
                                <a href="about">About</a>
                                <ul id={window.location.pathname == "/product"?"selected":""} className="primary">
                                    <li>
                                        <a href="product">Product</a>
                                    </li>
                                </ul>
                            </li>
                            <li className={window.location.pathname == "/blog"?"menu selected":"menu"}>
                                <a href="blog">Blog</a>
                                <ul id={window.location.pathname == "/singlepost"?"selected":""} className="secondary">
                                    <li>
                                        <a href="singlepost">Single post</a>
                                    </li>
                                </ul>
                            </li>
                            <li className={window.location.pathname == "/contact"?"selected":""}>
                                <a href="contact">Contact</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

        </body>
    )
}

export default Header;