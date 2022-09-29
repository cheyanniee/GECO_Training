import './App.css';
import Header from "./Header";
import Footer from "./Footer";
import { useState, Component } from "react";
import PeopleList from "./PeopleList";

class Condition extends Component {
    /* 4. Create class component
       4.1 Conditional style in class component using array of objects. */

    constructor(){
        super();
        this.state = {
            "peopleList" : [{"name":"Jonathan",'age':65},
                            {"name":"Rachel",'age':25},
                            {"name":"Adeline",'age':75},
                            {"name":"Anthony",'age':85},
                            {"name":"Christine",'age':35},
                            {"name":"Aiden",'age':45},
                            {"name":"Catherine",'age':60},
                            {"name":"Abigail",'age':70}]
        }
    }

    render() {
        return(
            <body>
                <Header/>

                <h1>Condition</h1>

                <PeopleList peopleList={this.state.peopleList}/>

                <Footer/>
            </body>
        )
    }

}

//export the function to use in other component
export default Condition;