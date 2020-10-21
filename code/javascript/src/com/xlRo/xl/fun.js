
/**
 * Created by 26893 on 2020/10/7.
 */
var msg="Javascript Javascript Javascript";
var position=0;
function scroller() {
    var content=msg.substring(position,position.length)+msg.substring(0,position);
    document.getElementById("text1").value=content;
    position++;
    if(position>msg.length){
        position=0;
    }
}