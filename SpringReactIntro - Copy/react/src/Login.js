import Header from "./Header";
import Footer from "./Footer";
import { useState } from "react";

function Login(){
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    
    const emailChange = event => {
        setEmail(event.target.value);
    }

    const passwordChange = event => {
        setPassword(event.target.value);
    }

    const submit = event => {
        console.log(email, password);
        if (email == undefined || email == "") {
            alert("Email should not be empty!");
        } else if (password == undefined || password == "") {
            alert("Password should not be empty!");
        } else {
            fetch("http://localhost:8080/login", {
                method:"POST",
                body:JSON.stringify({
                    "email": email,
                    "password": password
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

            <h1>Login</h1>

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

                <button onClick={submit}>Login</button>
            </div>

            <Footer/>
        </body>
    )
}

export default Login;