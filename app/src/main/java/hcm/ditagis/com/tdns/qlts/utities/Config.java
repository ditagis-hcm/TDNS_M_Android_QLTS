package hcm.ditagis.com.tdns.qlts.utities;

import android.content.Context;

/**
 * Created by NGUYEN HONG on 3/20/2018.
 */

public class Config {
    private String url;
    private String[] queryField;
    private String[] outField;
    private String[] updateField;
    private String titleLayer;
    private String layerID;
    private int minScale;
    private Context mContext;
    private static Config instance = null;
    private String groupLayer;


    public static Config getInstance() {
        if (instance == null) instance = new Config();
        return instance;
    }

    private Config() {
    }

    public String[] getUpdateField() {
        return updateField;
    }

    public void setUpdateField(String[] updateField) {
        this.updateField = updateField;
    }

    //    CONSTRUCTOR OF BASEMAP
    public Config(String url, String layerID, String titleLayer, String groupLayer) {
        this.layerID = layerID;
        this.url = url;
        this.titleLayer = titleLayer;
        this.groupLayer = groupLayer;
    }
    public Config(String url, String layerID, String titleLayer, int minScale, String groupLayer, String[] updateField){
        this.layerID = layerID;
        this.url = url;
        this.titleLayer = titleLayer;
        this.minScale = minScale;
        this.groupLayer = groupLayer;
        this.updateField = updateField;
    }
    public Config(String url, String titleLayer, int minScale, String groupLayer, String[] updateField){
        this.url = url;
        this.titleLayer = titleLayer;
        this.minScale = minScale;
        this.groupLayer = groupLayer;
        this.updateField = updateField;
    }

    public Config(String url, String[] queryField, String[] outField, String titleLayer, int minScale, String[] updateField) {
        this.url = url;
        this.queryField = queryField;
        this.outField = outField;
        this.updateField = updateField;
        this.titleLayer = titleLayer;
        this.minScale = minScale;
    }

    public Config(String url, String[] queryField, String[] outField, String layerID, String titleLayer, int minScale, String[] updateField, String groupLayer) {
        this.url = url;
        this.queryField = queryField;
        this.outField = outField;
        this.updateField = updateField;
        this.titleLayer = titleLayer;
        this.minScale = minScale;
        this.layerID = layerID;
        this.groupLayer = groupLayer;
    }

    public int getMinScale() {
        return minScale;
    }

    public void setMinScale(int minScale) {
        this.minScale = minScale;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String[] getQueryField() {
        return queryField;
    }

    public void setQueryField(String[] queryField) {
        this.queryField = queryField;
    }

    public String[] getOutField() {
        return outField;
    }

    public void setOutField(String[] outField) {
        this.outField = outField;
    }

    public String getTitleLayer() {
        return titleLayer;
    }

    public void setTitleLayer(String titleLayer) {
        this.titleLayer = titleLayer;
    }

    public String getLayerID() {
        return layerID;
    }

    public void setLayerID(String layerID) {
        this.layerID = layerID;
    }

    public String getGroupLayer() {
        return groupLayer;
    }

    public void setGroupLayer(String groupLayer) {
        this.groupLayer = groupLayer;
    }
}
