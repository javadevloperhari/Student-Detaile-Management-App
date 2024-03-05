import React, { useState,useEffect } from 'react';
import axios from 'axios';


export default function Home() {
     const [users, setUsers]=useState([]);

     useEffect(()=>{
        loadUsers();

     },[]);
     const loadUsers=async()=>{
        const result=await axios.get("http://localhost:8080/user");
        setUsers(result.data);
     }

   
  return (
    
    <div className="container">
        <div className="py-4">
        <table className="table border shadow">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Student Name</th>
      <th scope="col">Father Name</th>
      <th scope="col">Percentage</th>
      <th scope="col">Mobile no</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
    {
        users.map((user,index)=>(
            <tr>
            <th scope="row" Key={index}>{index+1}1</th>
            <td>{user.studentname}</td>
            <td>{user.fathertname}</td>
            <td>{user.percentage}</td>
            <td>{user.mobileno}</td>
          </tr>
        ))
    }
   
   
  </tbody>
</table>

        </div>
    </div>
  )
}
