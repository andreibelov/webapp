import React, { Component } from 'react';


class Employee extends Component {
    render() {
        return (
        <tr>
            <td>{this.props.employee.name}</td>
            <td>{this.props.employee.age}</td>
            <td>{this.props.employee.years}</td>
        </tr>);
    }
}

export default Employee;