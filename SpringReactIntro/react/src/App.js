import './App.css';
import Home from './Home.js'
import Login from './Login.js'
import Users from './Users.js'
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";

function App() {
    return (
        <div>
            <Router>
                <Routes>
                    <Route path ='/home' element={<Home />}/>
                    <Route path ='/login' element={<Login />}/>
                    <Route path ='/users' element={<Users />}/>
                    <Route path ='/' element={<Home />}/>
                </Routes>
            </Router>
        </div>
    );
}

export default App;
