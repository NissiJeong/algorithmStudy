package algorithm.hellocoding

var nameMap = hashMapOf<String, Boolean>()

fun checkDuplicate(name: String){
    if(nameMap[name] != null){
        println("돌려보내세요")
    }else{
        nameMap[name] = true
        println("투표하세요")
    }
}

fun main() {
    checkDuplicate("tom")
    checkDuplicate("은진")
    checkDuplicate("은진")
}