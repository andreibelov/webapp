import React, { Component } from 'react';
import './App.scss';

import EmployeeTable from "./Employee/EmployeeTable";

const EMPLOYEES = [
    {name: 'Joe Biden', age: 45, years: 5},
    {name: 'President Obama', age: 54, years: 8},
    {name: 'Crystal Mac', age: 34, years: 12},
    {name: 'James Henry', age: 33, years: 2}
];

class App extends Component {
    render() {
        return (<EmployeeTable employees={EMPLOYEES}/>);
    }
}

export default App;
