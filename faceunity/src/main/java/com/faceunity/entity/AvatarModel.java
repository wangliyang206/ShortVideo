package com.faceunity.entity;

import android.os.Parcel;
import android.os.Parcelable;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;

/**
 * @author Richie on 2019.03.20
 */
@Entity
public class AvatarModel implements Parcelable {
    public static final int MALE = 1;
    public static final int FEMALE = 0;

    @Id(autoincrement = true)
    private Long id;
    @Transient
    private int iconId;
    @Transient
    private boolean isDefault;
    private String iconPath;
    private String configJson;
    // 性别，男 1，女 0
    private int gender;
    @Generated(hash = 1021308026)
    public AvatarModel(Long id, String iconPath, String configJson, int gender) {
        this.id = id;
        this.iconPath = iconPath;
        this.configJson = configJson;
        this.gender = gender;
    }
    @Generated(hash = 1677474030)
    public AvatarModel() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIconPath() {
        return this.iconPath;
    }
    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }
    public String getConfigJson() {
        return this.configJson;
    }
    public void setConfigJson(String configJson) {
        this.configJson = configJson;
    }
    public int getGender() {
        return this.gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeInt(this.iconId);
        dest.writeByte(this.isDefault ? (byte) 1 : (byte) 0);
        dest.writeString(this.iconPath);
        dest.writeString(this.configJson);
        dest.writeInt(this.gender);
    }

    public void readFromParcel(Parcel source) {
        this.id = (Long) source.readValue(Long.class.getClassLoader());
        this.iconId = source.readInt();
        this.isDefault = source.readByte() != 0;
        this.iconPath = source.readString();
        this.configJson = source.readString();
        this.gender = source.readInt();
    }

    protected AvatarModel(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.iconId = in.readInt();
        this.isDefault = in.readByte() != 0;
        this.iconPath = in.readString();
        this.configJson = in.readString();
        this.gender = in.readInt();
    }

    public static final Creator<AvatarModel> CREATOR = new Creator<AvatarModel>() {
        @Override
        public AvatarModel createFromParcel(Parcel source) {
            return new AvatarModel(source);
        }

        @Override
        public AvatarModel[] newArray(int size) {
            return new AvatarModel[size];
        }
    };
}
