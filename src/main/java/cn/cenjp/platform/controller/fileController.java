package cn.cenjp.platform.controller;import cn.cenjp.platform.Prefix.CountPrefix;import cn.cenjp.platform.bean.Good;import cn.cenjp.platform.bean.SpikeGoods;import cn.cenjp.platform.bean.User;import cn.cenjp.platform.utils.GetDate;import cn.cenjp.platform.utils.MethodUtil;import org.springframework.stereotype.Controller;import org.springframework.ui.Model;import org.springframework.util.ClassUtils;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RequestParam;import org.springframework.web.bind.annotation.ResponseBody;import org.springframework.web.multipart.MultipartFile;import javax.servlet.http.HttpServletRequest;import java.io.File;import java.io.IOException;import java.nio.file.Path;@Controllerpublic class fileController {    @RequestMapping("/fileUpload")    public String getFileUpLoad(){        return "fileUpload";    }//    @RequestMapping("/doFileUpload")//    @ResponseBody//    public String upLoadFile(@RequestParam("fileName") MultipartFile file){//        String fileName = file.getOriginalFilename();//        int size = (int) file.getSize();//        System.out.println(fileName + "-->" + size);////        String path = "G:\\新建文件夹 (2)" ;//        File dest = new File(path + "/" + fileName);//        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在//            dest.getParentFile().mkdir();//        }//        System.out.println(dest.getPath());//        try {//            file.transferTo(dest); //保存文件//            return "文件上传成功";//        } catch (IllegalStateException e) {//            // TODO Auto-generated catch block//            e.printStackTrace();//            return "文件上传失败";//        } catch (IOException e) {//            // TODO Auto-generated catch block//            e.printStackTrace();//            return "文件上传失败";//        }//    }//    @RequestMapping("/uploadFile")//    @ResponseBody//    public String uploadFile(String goodName, Double spikePrice, String goodIntroduction ,//                             String goodOriginalPrice, String spikeStartTime, String spikeEndTime ,//                             String spikeCount, String goodKind, MultipartFile file, Model model, User user){//        String fileName = file.getOriginalFilename();//        String path =  ClassUtils.getDefaultClassLoader().getResource("").getPath();//        System.out.println(path);//        File dest = new File(path + "/static/images/" + fileName);////        model.addAttribute("userName",user.getUser_name());//        model.addAttribute("user", user);//        Good good = MethodUtil.getGood(goodName,goodIntroduction, goodOriginalPrice,goodKind);//        SpikeGoods spikeGood = MethodUtil.getSpikeGood(spikePrice, spikeStartTime, spikeEndTime, spikeCount, good, user.getUser_id(),fileName);////        boolean flag = sendSpikeService.sendSpike(good, spikeGood);////        //更新发布的商品的数量//        if (flag){//            redisService.incrAll(CountPrefix.sendCountPrefix, GetDate.getDate());//        }//        return flag==true?1:0;////        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在//            dest.getParentFile().mkdir();//        }//        System.out.println(dest.getPath());//        try {//            file.transferTo(dest); //保存文件//            return "文件上传成功";//        } catch (IllegalStateException e) {//            e.printStackTrace();//            return "文件上传失败";//        } catch (IOException e) {//            e.printStackTrace();//            return "文件上传失败";//        }//    }}