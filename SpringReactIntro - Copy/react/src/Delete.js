import Header from "./Header";
import Footer from "./Footer";
import { useState } from "react";

function Delete(){
    const [userID, setUserID] = useState("amy@email.com");

    const submit = event => {
        console.log(userID);
        if (userID == undefined || userID == "") {
            alert("Target Email should not be empty!");
        } else {
            fetch("http://localhost:8080/delete", {
                method:"POST",
                body:JSON.stringify({
                    "email": userID
                }),
                headers:{
                    'Content-Type': 'application/json'
                },
            })
            .then(res => res.json())
            .then(res2 => {console.log(res2); alert(res2.message)})
            .catch(err => alert(err))
        }
    }

    return(
        <body>
            <Header/>

            <h1>Delete User</h1>

            <div className="formInputs">
                <p>
                    Target Email:
                    <select onChange={(e)=>setUserID(e.target.value)}>
                        <option value="amy@email.com"> amy@email.com</option>
                        <option value="brenda@email.com"> brenda@email.com</option>
                        <option value="charlie@email.com"> charlie@email.com</option>
                        <option value="denise@email.com"> denise@email.com</option>
                        <option value="elena@email.com"> elena@email.com</option>
                        <option value="fiona@email.com"> fiona@email.com</option>
                        <option value="groot@email.com"> groot@email.com</option>
                        <option value="helen@email.com"> helen@email.com</option>
                        <option value="iris@email.com"> iris@email.com</option>
                    </select>
                </p>

                <button onClick={submit}>Delete</button>
            </div>

            <Footer/>
        </body>
)
}

export default Delete;