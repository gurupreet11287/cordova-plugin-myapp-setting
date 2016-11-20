//var exec = require('cordova/exec');
var MyAppSetting = (function(){

    MyAppSetting = {
        open: function(successFn, errorFn){
            cordova.exec(successFn,errorFn,'MyAppSetting','open',[]);
        }
    };
    return MyAppSetting;
});
module.exports = new MyAppSetting();