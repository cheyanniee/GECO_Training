import Header from "./Header";
import Footer from "./Footer";
import { useState } from "react";

function Register(){
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
        console.log(email, password, mobile, address);
        if (email == undefined || email == "") {
            alert("Email should not be empty!");
        } else if (password == undefined || password == "") {
            alert("Password should not be empty!");
        } else if (mobile == undefined || mobile == "") {
            alert("Mobile should not be empty!");
        } else if (address == undefined || address == "") {
            alert("Address should not be empty!");
        } else {
            fetch("http://localhost:8080/register", {
                method:"POST",
                body:JSON.stringify({
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
            .then(res2 => {console.log(res2); alert(res2.message)})
            .catch(err => alert(err))
        }
    }

    return(
        <body>
            <Header/>

            <h1>Register</h1>

            <div className="formInputs">
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

                <button onClick={submit}>Register</button>
            </div>

            <Footer/>
        </body>
    )
}

export default Register;