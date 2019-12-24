CallingFile : Process {
 *new{
 arg name="";
 var file="";
 if (file=="", {file=thisProcess.nowExecutingPath.dirname},{});
 ^(file ++ "/" ++ name).loadPaths;
 }
}
//example :
//CallingFile("fileName.scd");