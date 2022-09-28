import './App.css';
import Header from "./Header";
import Footer from "./Footer";
import { useState, Component } from "react";

class Post extends Component {
    /* 3. create class component
       3.1 call the server with post api. */

    constructor(){
        super();
        this.state={
            "name":"",
            "profession":""
         }
    }

    nameChange = event => {
        this.state.name += event.target.value;
        console.log("name: ", this.state.name);
    }

    professionChange = event => {
        this.state.profession += event.target.value;
        console.log("profession: ", this.state.profession);
    }

    submit = event => {
        let name = this.state.name;
        let profession = this.state.profession;
        console.log(name, profession);
        if (name == undefined || name == "") {
            alert("Name should not be empty!");
        } else if (profession == undefined || profession == "") {
            alert("Profession should not be empty!");
        } else {
            fetch('https://reqres.in/api/users', {
                method: 'POST',
                body: JSON.stringify({
                    "name": name,
                    "job": profession
                }),
                headers: {
                    'Content-Type': 'application/json',
                },
            })
            .then((res) => res.json())
            .then((res2) => {
                console.log(res2);
                alert("Data Stored!");
            })
            .catch((error) => {
                console.log(error);
                alert(error);
            })
        }
    }

    render(){
        return(
            <body>
                <Header/>

                <h1>Post API</h1>

                <div className="postAPI">
                    <p>
                        Name:
                        <input
                            type="text"
                            value={this.state.name}
                            onChange={(e)=>this.setState({"name":e.target.value})}
                        />
                    </p>

                    <p>
                        Profession:
                        <input
                            type="text"
                            value={this.state.profession}
                            onChange={(e)=>this.setState({"profession":e.target.value})}
                        />
                    </p>

                    <button onClick={this.submit}>Submit</button>
                </div>

                <Footer/>
            </body>
        )
    }
}

//export the function to use in other component
export default Post;