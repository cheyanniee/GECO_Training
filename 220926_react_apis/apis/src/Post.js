import './App.css';
import Header from "./Header";
import Footer from "./Footer";
import { useState } from "react";

function Post(){
    /* 1. Call the post API from react button click with react state. */

    const [name,setName] = useState("");
    const [profession,setProfession] = useState("");

    const nameChange = event => {
        setName(event.target.value);
    }

    const professionChange = event => {
        setProfession(event.target.value);
    }

    const submit = event => {
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

    return(
        <body>
            <Header/>

            <h1>Post</h1>

            <div className="formInputs">
                <p>
                    Name:
                    <input
                        type="text"
                        onChange={nameChange}
                        value={name}
                        placeholder="Enter name"
                    />
                </p>

                <p>
                    Profession:
                    <input
                        type="text"
                        onChange={professionChange}
                        value={profession}
                        placeholder="Enter profession"
                    />
                </p>

                <button onClick={submit}>Submit</button>
            </div>

            <Footer/>
        </body>
    )
}

//export the function to use in other component
export default Post;