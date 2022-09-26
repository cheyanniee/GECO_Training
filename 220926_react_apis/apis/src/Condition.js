import './App.css';
import Header from "./Header";
import Footer from "./Footer";
import { useState } from "react";

function Condition(){
    /* 2. Conditional class. Create array of object with name and age.
        If age > 50, highlight in red. */

    let peopleList = [
        {"name":"Jonathan",'age':65},
        {"name":"Rachel",'age':25},
        {"name":"Adeline",'age':75},
        {"name":"Anthony",'age':85},
        {"name":"Christine",'age':35},
        {"name":"Aiden",'age':45},
        {"name":"Catherine",'age':60},
        {"name":"Abigail",'age':70},
    ];

    return(
        <body>
            <Header/>

            <h1>Condition</h1>

            <table>
                {
                    peopleList.map((peopleObj, idx)=>{
                        return (
                            <tr className={peopleObj.age>50?"old_people":"young_people"}>
                                <td>{peopleObj.name}</td>
                                <td>{peopleObj.age}</td>
                            </tr>
                        )
                    })
                }
            </table>

            <Footer/>
        </body>
    )
}

//export the function to use in other component
export default Condition;