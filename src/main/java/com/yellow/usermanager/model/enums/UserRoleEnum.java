package com.yellow.usermanager.model.enums;

import org.apache.commons.lang3.ObjectUtils;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户角色枚举
 * @author 陈翰垒
 */
public enum UserRoleEnum {

    USER("用户", "user"),
    ADMIN("管理员", "admin"),
    BAN("被封号", "ban");

    private final String text;

    private final String value;

    UserRoleEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值的列表
     *
     * @return 值列表
     */
    public static List<String> getValues() {
        return Arrays.stream(values()).map(item->item.value).collect(Collectors.toList());
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value 枚举的 value
     * @return 枚举
     */
    public static UserRoleEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(UserRoleEnum.values())) {
            return null;
        }
        for (UserRoleEnum userRole : UserRoleEnum.values()) {
            if(userRole.value.equals(value)){
                return userRole;
            }
        }
        return null;
    }

    public String getText() {
        return text;
    }
    public String getValue(){
        return value;
    }

}
