import Header from "./Header";
import Footer from "./Footer";
import { useState } from "react";

function Users(){
    const [userID, setUserID] = useState("");

        const userIDChange = event => {
            setUserID(event.target.value);
        }

        const submit = event => {
            console.log(userID);
            if (userID == undefined || userID == "") {
                alert("userID should not be empty!");
            } else {
                fetch("http://localhost:8080/user/"+userID, {
                    method:"GET",
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

                <h1>Check User Exists</h1>

                <div className="formInputs">
                    <p>
                        userID:
                        <input
                            type="text"
                            onChange={userIDChange}
                            value={userID}
                            placeholder="Enter userID"
                        />
                    </p>

                    <button onClick={submit}>Get User</button>
                </div>

                <Footer/>
            </body>
        )
}

export default Users;