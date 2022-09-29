import './App.css';
import Home from './Home.js'
import About from './About.js'
import Contact from './Contact.js'
import Pricing from './Pricing.js'
import Work from './Work.js'
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";


function App() {
    return (
        <div>
            <Router>
                <Routes>
                    <Route path ='/home' element={<Home />}/>
                    <Route path ='/about' element={<About />}/>
                    <Route path ='/contact' element={<Contact />}/>
                    <Route path ='/pricing' element={<Pricing />}/>
                    <Route path ='/work' element={<Work />}/>
                    <Route path ='/' element={<Home />}/>
                </Routes>
            </Router>
        </div>
    );
}

export default App;
