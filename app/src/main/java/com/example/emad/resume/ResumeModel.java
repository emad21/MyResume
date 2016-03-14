package com.example.emad.resume;

import java.util.List;


/**
 * Created by emad on 14/03/16.
 */
public class ResumeModel {
	 private String name;
    private String email;
    private String phone;
    private String edu;
    private String uni;


    private List<tskills> tskillList;
    private List<projects> projectsList;
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public List<tskills> getTskillList() {
        return tskillList;
    }

    public void setTskillList(List<tskills> tskillList) {
        this.tskillList = tskillList;
    }

    public List<projects> getProjectsList() {
        return projectsList;
    }

    public void setProjectsList(List<projects> projectsList) {
        this.projectsList = projectsList;
    }

    public static class tskills{
        private String language;
        private String os;
        private String techno;
        private String webd;
        private String mobilep;
        private String types;

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getOs() {
            return os;
        }

        public void setOs(String os) {
            this.os = os;
        }

        public String getTechno() {
            return techno;
        }

        public void setTechno(String techno) {
            this.techno = techno;
        }

        public String getWebd() {
            return webd;
        }

        public void setWebd(String webd) {
            this.webd = webd;
        }

        public String getMobilep() {
            return mobilep;
        }

        public void setMobilep(String mobilep) {
            this.mobilep = mobilep;
        }

        public String getTypes() {
            return types;
        }

        public void setTypes(String types) {
            this.types = types;
        }
    }
    public static class projects{
        private String webpro;
        private String ai;
        private String crypto;
        private String ml;

        public String getWebpro() {
            return webpro;
        }

        public void setWebpro(String webpro) {
            this.webpro = webpro;
        }

        public String getAi() {
            return ai;
        }

        public void setAi(String ai) {
            this.ai = ai;
        }

        public String getCrypto() {
            return crypto;
        }

        public void setCrypto(String crypto) {
            this.crypto = crypto;
        }

        public String getMl() {
            return ml;
        }

        public void setMl(String ml) {
            this.ml = ml;
        }
    }




  
}
