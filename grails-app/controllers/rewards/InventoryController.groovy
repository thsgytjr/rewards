package rewards

class InventoryController {

    def index() {
        render "Here is list of everything."
    }

    def edit (){
        def productName = "Random product"

        [product: productName]
    }
    def remove (){
        render "you have one less then before."
    }
}
