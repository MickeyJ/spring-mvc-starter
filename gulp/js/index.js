import React from 'react';
import { render } from 'react-dom';

const App = () => (
  <span style={{fontSize: 25}}>React Component!</span>
);

render(
    <App />,
    document.getElementById('react')
);