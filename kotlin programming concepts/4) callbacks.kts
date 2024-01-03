interface OnClickListener {
    fun onClick()
}

class Button {

    // A common way to handle 'callback' code,
    // is to set a property/variable on another class
    private var onClickListener: OnClickListener? = null

    fun performClick() {
        println("In the button's perform click function...")
        // This is where the callback happens. When the button is clicked,
        // We attempt to run the onClick method of the
        // OnclickListener interface, if one has been set
        // *** 4 ***
        onClickListener?.onClick()
    }

    // This is where we provide the 'other code' with our 'callback code'
    // The callback exists within an interface
    // This is where we give the interface to our button class
    // *** 2 ***
    fun setOnClickListener(objectName: OnClickListener) {
        onClickListener = objectName
    }


}

val button = Button()
button.performClick()


// *** 1 ***
button.setOnClickListener(object: OnClickListener {

    // *** 5 ***
    override fun onClick() {
        println("Now we are in the callback code!")
    }

})

// *** 3 ***
button.performClick()