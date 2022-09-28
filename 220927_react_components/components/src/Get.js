import './App.css';
import Header from "./Header";
import Footer from "./Footer";
import { useState, Component } from "react";
import UserList from "./UserList";

class Get extends Component {
    /* 2. create class component
       2.1 call the server with get api. */

    constructor(){
        super();
        this.state = {
            "firstname":"",
            "lastName":"",
            "email":"",
            "avatar":"",
            "id":"",
            "pageNo":1
        }
    }

    getApiResponse = (pageNo)=>{
        fetch("https://reqres.in/api/users?page="+pageNo)
        .then(res=>res.json())
        .then(res2=>{
            this.setState({"userList":res2['data']});
            console.log(res2);
        })
    }

    render() {
        return(
            <body>
                <Header/>

                <h1>Users</h1>

                <div>
                    <select onChange={(e)=>this.getApiResponse(e.target.value)}>
                        <option value="1"> page 1</option>
                        <option value="2"> page 2</option>
                    </select>

                    <button onClick={()=>this.getApiResponse(1)}>Get Users</button>

                    <UserList userList={this.state.userList}/>
                </div>

                <Footer/>
            </body>
        );
    };
}

//export the function to use in other component
export default Get;