import './App.css';
function Header(){
    return(
        <ul className='header'>
            <li><a href='home'>Home</a></li>
            <li><a href='login'>Login</a></li>
            <li><a href='register'>Register</a></li>
            <li><a href='update'>Update</a></li>
            <li><a href='delete'>Delete</a></li>
        </ul>
    )
}

export default Header;