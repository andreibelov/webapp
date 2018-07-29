import './App.scss';
import React, { Component } from 'react';
import EmployeeTable from "./Employee/EmployeeTable";

const client = require('../api/client');

class App extends Component {

    constructor(props) {
        super(props);
        this.state = {employees: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/v2/employees'}).done(response => {
            this.setState({employees: response.entity._embedded.employees});
        });
    }

    render() {
        return (<EmployeeTable employees={this.state.employees}/>);
    }
}

export default App;
