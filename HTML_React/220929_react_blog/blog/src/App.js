import './App.css';
import Home from './Home.js'
import About from './About.js'
import Blog from './Blog.js'
import Contact from './Contact.js'
import Product from './Product.js'
import SinglePost from './SinglePost.js'
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";


function App() {
    return (
        <div>
            <Router>
                <Routes>
                    <Route path ='/home' element={<Home />}/>
                    <Route path ='/about' element={<About />}/>
                    <Route path ='/blog' element={<Blog />}/>
                    <Route path ='/contact' element={<Contact />}/>
                    <Route path ='/product' element={<Product />}/>
                    <Route path ='/singlepost' element={<SinglePost />}/>
                    <Route path ='/' element={<Home />}/>
                </Routes>
            </Router>
        </div>
    );
}

export default App;
