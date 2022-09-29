function PeopleList(props){
    return (
        <>
        {(props.peopleList && props.peopleList.length <=0)?<h1>No User Found</h1>:''}
            {
                props.peopleList && props.peopleList.map((userObj,idx)=>{
                    return  <div className={userObj.age>50?"old_people":"young_people"} key={idx}>{userObj.name} -- {userObj.age}</div>
               })
            }
        </>
    )
}

export default PeopleList;