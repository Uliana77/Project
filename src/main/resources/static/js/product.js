function addDivPaginated(data, contentDiv, style) {
    addDiv(data.content, contentDiv, style)
}

function addDiv(array, contentDiv, style) {


    for (i = 0; i < array.length; i++) {
        let product = array[i];

        let newP = document.createElement('div')
        newP.classList.add(style);

        let newName = document.createElement('p')
        newName.innerHTML = product.name
        newP.appendChild(newName)


        let nnewText = document.createElement('p')
        nnewText.innerHTML = product.description
        newP.appendChild(nnewText)

        let newPrice = document.createElement('p')
        newPrice.innerHTML = product.price
        newP.appendChild(newPrice)

        let newImg = document.createElement('img')
        newImg.src = ("/image/" + product.imageId + ".png")
        newImg.classList.add("imgAdd");
        newP.appendChild(newImg)

        let add = document.createElement('div')
        add.innerHTML = "add to cart"
        add.onclick = function () {
            addToCart(product.id)
        }

        //  add.onclick = () => addToCart(product.id)
        add.classList.add("button");
        newP.appendChild(add)
        //  <button onclick="addToCart(6)">


        let con = document.getElementById(contentDiv)
        con.appendChild(newP)

    }
}

var current;

function getAllProduct(page) {
    current = page
    fetch('/product?count=9&page=' + current)   //1
        .then(r = > r.json()
)
    // .then(r => r.content)
.
    then(r = > addDivPaginated(r, 'content', 'mystyle')
)
}


function addToCart(id) {
    fetch('/cart?id=' + id,
        {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            credentials: "same-origin"
        }).then(r = > console.log("add")
)
.
    then(r = > console.log(id)
)

.
    then(r = > addList(r)
)
    ;
}

function addList() {

}

getAllProduct(0)