import React, { Component } from 'react';
import Employee from "./Employee.jsx";

class EmployeeTable extends Component {
    render() {
        let rows = [];
        this.props.employees.forEach(function(employee) {
            rows.push(<Employee employee={employee} />);
        });
        return (
            <table className="table table-striped table-dark">
                <thead>
                <tr>
                    <th>Name</th><th>Age</th><th>Years</th>
                </tr>
                </thead>
                <tbody>{rows}</tbody>
            </table>
        );
    }
}

export default EmployeeTable;