import React from 'react';
import ReactDOM from 'react-dom';

// require.context("!!file?name=[path][name].[ext]&context=./public!../public/", true, /^\.\/.*\.*/);

import App from './components/App';

ReactDOM.render(
    <App />,
    document.getElementById('root')
);
