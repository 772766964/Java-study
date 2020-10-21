
/**
 * Created by 26893 on 2020/10/7.
 */
var msg="Javascript是前端开发中应用最广泛的语言"+"请大家务必认真学习，它必将为你的职业生涯增色不少！";
var position=0
function scroller() {
    var content=msg.substring(position,position.length)
        +"....."
        +msg.substring(0,position);
    document.getElementById("text1").value=content;
    position++;
    if(position>msg.length){
        position=0;
    }
}