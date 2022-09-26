import './App.css';
import Header from "./Header";
import Footer from "./Footer";
import { useState } from "react";

const Users = () => {
    /* 3. Call the get api and show first name and his image (avatar).
       Click the the user detail and show email, firstName, lastname, id, image separately in the page. */

    const [pageNo, setPageNo] = useState("1");
    const [userList,setUserList] = useState();
    const [firstName, setFirstName] = useState();
    const [lastName, setLastName] = useState();
    const [email, setEmail] = useState();
    const [id, setId] = useState();
    const [image, setImage] = useState();
    const [details, setDetails] = useState();

    const changePageNo = event => {
        setPageNo(event.target.value);
    };

    const getUsers = event => {
        console.log('pageNo:', pageNo);
        fetch("https://reqres.in/api/users?page="+pageNo)
        .then(res=>res.json())
        .then(res2=>{
            setUserList(res2['data']);
            console.log(res2);
        })
        console.log('userList:', userList)
    };

    const viewDetails=(obj)=>{
        console.log(obj);
        setDetails("Selected:");
        setFirstName("First Name: " + obj.first_name);
        setLastName("Last Name: " + obj.last_name);
        setEmail("Email: " + obj.email);
        setId("ID: " + obj.id);
        setImage(obj.avatar);
    }

    return (
        <body>
            <Header/>

            <h1>Users</h1>

            <div>
                <select id="pageNo" name="pageNo" onChange={changePageNo} value={pageNo}>
                    <option value="1">Page 1</option>
                    <option value="2">Page 2</option>
                </select>

                <button onClick={getUsers}>Click to retrieve user list</button>
            </div>

            <br/>

            <div>
                <table>
                    <tr>
                        {(userList && userList.length <=0)?<h1>No User Found</h1>:''}
                        {
                            userList && userList.map((userObj,idx)=>{
                                return <td onClick={()=>viewDetails(userObj)} key={idx} className="users">
                                            <img src={userObj.avatar} alt="img"/>
                                            <br/>
                                            {userObj.first_name}
                                       </td>
                            })
                        }
                    </tr>
                    <br/>
                    <tr className="userDetails">{details}</tr>
                    <tr>
                        <td className="userDetails">
                            <img src={image} alt=""/>
                        </td>
                        <td className="userDetails">
                            {firstName}
                            <br/><br/>

                            {lastName}
                            <br/><br/>

                            {email}
                            <br/><br/>

                            {id}
                            <br/><br/>
                        </td>
                    </tr>
                </table>
            </div>

            <Footer/>
        </body>
    );
};

//export the function to use in other component
export default Users;