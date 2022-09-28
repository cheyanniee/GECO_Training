import './App.css';
import Home from './Home.js'
import Logout from './Logout.js'
import Get from './Get.js'
import Post from './Post.js'
import Condition from './Condition.js'
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";


function App() {
    return (
        <div>
            <Router>
                <Routes>
                    <Route path ='/home' element={<Home />}/>
                    <Route path ='/logout' element={<Logout />}/>
                    <Route path ='/get' element={<Get />}/>
                    <Route path ='/post' element={<Post />}/>
                    <Route path ='/condition' element={<Condition />}/>
                    <Route path ='/' element={<Home />}/>
                </Routes>
            </Router>
        </div>
    );
}

export default App;
