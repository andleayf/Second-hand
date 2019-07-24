package com.xcy.controller;


import com.xcy.service.SendSaleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
public class SendSaleController {

    @Autowired
    SendSaleService sendSaleService;

    //图片保存地址
    @Value("${IMAGE_DIR}")
    String imageDir;
    @Value("${IMAGE_URL}")
    String imageUrl;

    @RequestMapping("/getGoodsImg")
    @ResponseBody
    @ApiOperation(value = "将发布商品的图片保存到一个文件夹里")
    public void insertIntoGoodsImg(MultipartFile beforeImg ,MultipartFile codeImg,MultipartFile brandImg,MultipartFile faPiaoImg , int userId){
        //正面照图片
        String zmtOldFileName = beforeImg.getOriginalFilename();
        String zmtNewFileName = UUID.randomUUID().toString().replace("-","") + zmtOldFileName.substring(zmtOldFileName.lastIndexOf("."));
        //序列号图片
        String xlhOldFileName = codeImg.getOriginalFilename();
        String xlhNewFileName = UUID.randomUUID().toString().replace("-","") + xlhOldFileName.substring(xlhOldFileName.lastIndexOf("."));
        //品牌Logo图片
        String LogoOldFileName = brandImg.getOriginalFilename();
        String LogoNewFileName = UUID.randomUUID().toString().replace("-","") + LogoOldFileName.substring(LogoOldFileName.lastIndexOf("."));
        //发票图片
        String fpOldFileName = faPiaoImg.getOriginalFilename();
        String fpNewFileName = UUID.randomUUID().toString().replace("-","") + fpOldFileName.substring(fpOldFileName.lastIndexOf("."));

        //通过日期的文件夹对保存的图片文件进行管理
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //创建的文件夹的名字
        String dirName = dateFormat.format(date);
        String targetDirName = imageDir + dirName;
        //判断文件夹是否存在
        File file = new File(targetDirName);
        if (!file.exists()){
            file.mkdirs();
        }
        try {
            //用新的文件的名字替换掉
            beforeImg.transferTo(new File(targetDirName,zmtNewFileName));
            codeImg.transferTo(new File(targetDirName,xlhNewFileName));
            brandImg.transferTo(new File(targetDirName,LogoNewFileName));
            faPiaoImg.transferTo(new File(targetDirName,fpNewFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(zmtNewFileName + "," + xlhNewFileName + "," +LogoNewFileName + "," + fpNewFileName);

        sendSaleService.insertIntoGoodsImg(dirName + "/" + zmtNewFileName , dirName + "/" + xlhNewFileName ,dirName + "/" + LogoNewFileName ,dirName + "/" + fpNewFileName ,userId);

    }

}
