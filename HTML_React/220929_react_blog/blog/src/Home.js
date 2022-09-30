import Header from'./Header.js'
import Footer from './Footer.js'

function Home(){
    return(
        <body>
            <Header/>

            <div id="body" className="home">
              <div className="header">
                <img src="images/bg-home.jpg" alt="" />
                <div>
                  <a href="product">Freeze Delight</a>
                </div>
              </div>
              <div className="body">
                <div>
                  <div>
                    <h1>NEW PRODUCT</h1>
                    <h2>The Twist of Healthy Yogurt</h2>
                    <p>This website template has been designed by freewebsitetemplates.com for you, for free. You can replace all this text with your own text.</p>
                  </div>
                  <img src="images/yogurt.jpg" alt="" />
                </div>
              </div>
              <div className="footer">
                <div>
                  <ul>
                    <li>
                      <a href="product" className="product" />
                      <h1>PRODUCTS</h1>
                    </li>
                    <li>
                      <a href="about" className="about" />
                      <h1>OUR STORY</h1>
                    </li>
                    <li>
                      <a href="product" className="flavor" />
                      <h1>FLAVORS</h1>
                    </li>
                    <li>
                      <a href="contact" className="contact" />
                      <h1>OUR LOCATION</h1>
                    </li>
                  </ul>
                </div>
              </div>
            </div>

            <Footer/>
        </body>
    )
}

export default Home;