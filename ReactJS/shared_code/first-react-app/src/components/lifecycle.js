import React from 'react';

export class LifeCycleComponent extends React.Component {
    constructor(props) {
        super(props);
        this.state = { date: new Date() }; //Initialize the state
        console.log('[LifeCycleComponent] - constructor');
    }

    static getDerivedStateFromProps(nextProps, prevState) {
        console.log('[LifeCycleComponent] - getDerivedStateFromProps() nextProps: ', nextProps, ' - prevState: ', prevState);
        return null;
    }

    render() {
        console.log('[LifeCycleComponent] - render()');
        return <div>
        <h1>Life cycle demo</h1>
        <br></br><br></br>
        <h2>{this.state.date.toLocaleTimeString()}</h2>
        </div>
    }

    componentDidMount() {
        console.log('[LifeCycleComponent] - componentDidMount()');
        setInterval(
            ()=>this.setState({date: new Date()}),
        1000);
    }

    shouldComponentUpdate(nextProps, nextState) {
        console.log('[LifeCycleComponent] - shouldComponentUpdate()');
        return true;
    }

    getSnapshotBeforeUpdate(prevProps, prevState) {
        console.log('[LifeCycleComponent] - getSnapshotBeforeUpdate() prevProps: ', prevProps, ' - prevState: ', prevState);
    }

    componentDidUpdate(prevProps, prevState) {
        console.log('[LifeCycleComponent] - componentDidUpdate() prevProps: ', prevProps, ' - prevState: ', prevState);
    }

    componentWillUnmount() {
        console.log('[LifeCycleComponent] - componentWillUnmount()');
    }
}