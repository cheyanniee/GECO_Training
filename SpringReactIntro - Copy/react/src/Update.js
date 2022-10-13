import Header from "./Header";
import Footer from "./Footer";
import { useState } from "react";

function Update(){
    const [userID, setUserID] = useState("amy@email.com");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [mobile, setMobile] = useState("");
    const [address, setAddress] = useState("");

    const emailChange = event => {
        setEmail(event.target.value);
    }

    const passwordChange = event => {
        setPassword(event.target.value);
    }

    const mobileChange = event => {
        setMobile(event.target.value);
    }

    const addressChange = event => {
        setAddress(event.target.value);
    }

    const submit = event => {
        console.log(userID);
        console.log(email, password, mobile, address);
        if (userID == undefined || userID == "") {
            alert("Target Email should not be empty!");
        } else {
            fetch("http://localhost:8080/update", {
                method:"POST",
                body:JSON.stringify({
                    "targetemail": userID,
                    "email": email,
                    "password": password,
                    "mobile": mobile,
                    "address": address
                }),
                headers:{
                    'Content-Type': 'application/json'
                },
            })
            .then(res => res.json())
            .then(res2 => {console.log(res2); alert(res2.error)})
            .catch(err => alert(err))
        }
    }

    return(
        <body>
            <Header/>

            <h1>Update User</h1>

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

                <p>
                    Email:
                    <input
                        type="text"
                        onChange={emailChange}
                        value={email}
                        placeholder="Enter email"
                    />
                </p>

                <p>
                    Password:
                    <input
                        type="text"
                        onChange={passwordChange}
                        value={password}
                        placeholder="Enter password"
                    />
                </p>

                <p>
                    Mobile:
                    <input
                        type="text"
                        onChange={mobileChange}
                        value={mobile}
                        placeholder="Enter password"
                    />
                </p>

                <p>
                    Address:
                    <input
                        type="text"
                        onChange={addressChange}
                        value={address}
                        placeholder="Enter address"
                    />
                </p>

                <button onClick={submit}>Update</button>
            </div>

            <Footer/>
        </body>
)
}

export default Update;