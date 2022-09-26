import './App.css';
import Home from './Home.js'
import Post from './Post.js'
import Condition from './Condition.js'
import Users from './Users.js'
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";


function App() {
  return (
      <div>
        <Router>
          <Routes>
            <Route path ='/home' element={<Home />}/>
            <Route path ='/post' element={<Post />}/>
            <Route path ='/condition' element={<Condition />}/>
            <Route path ='/users' element={<Users />}/>
            <Route path ='/' element={<Home />}/>
            
          </Routes>
        </Router>
        








      </div>


  );
}

export default App;
