import './App.css';
import Home from './Home.js'
import Login from './Login.js'
import Register from './Register.js'
import Update from './Update.js'
import Delete from './Delete.js'
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";

function App() {
    return (
        <div>
            <Router>
                <Routes>
                    <Route path ='/home' element={<Home />}/>
                    <Route path ='/login' element={<Login />}/>
                    <Route path ='/register' element={<Register />}/>
                    <Route path ='/update' element={<Update />}/>
                    <Route path ='/delete' element={<Delete />}/>
                    <Route path ='/' element={<Home />}/>
                </Routes>
            </Router>
        </div>
    );
}

export default App;
