const db = firebase.firestore();

function writeData() {
    db.collection("user").doc("personOne").set({
        name: "Jimmy Smith",
        contactInfo: "JimmySmith@uw.edu"
    })
    .then(function() {
        console.log("Document successfully written!");
    })
    .catch(function(error){
        console.error("Error adding document: ", error);
    });
}