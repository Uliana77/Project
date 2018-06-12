function clickIs() {
    let fn = document.getElementById('firstName').value
    let ln = document.getElementById('lastName').value
    let em = document.getElementById('email').value
    let me = document.getElementById('message').value
    let con = {
        firstName: fn,
        message: me,
        lastName: ln,
        email: em
    }
    fetch('/contacts',
        {
            method: 'POST',
            body: JSON.stringify(con),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(r = > r.text()
)
.
    then(r = > console.log(r)
)


}

function refresh() {
    window.location.reload(true);
}