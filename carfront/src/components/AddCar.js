import React, { useState} from 'react';
import Dialog from '@mui/material/Dialog';
import DialogActions from '@mui/material';
import DialogContent from '@mui/material';
import DialogTitle from '@mui/material';

function AddCar(props) {
    const [open, setOpen] = useState(false);
    const [car, setCar] = useState({
        brand: '',
        model: '',
        color: '',
        year: '',
        fuel: '',
        price: ''
    });
    return(
        <div></div>
    );
}

export default AddCar;