package TW.Objects;

import TW.Enum.EnumObjects;

/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 18/07/2012
 * Time: 15:55
 * To change this template use File | Settings | File Templates.
 */
public class Books {
    public String Title;
    public String Code;
    public EnumObjects.BookStatus Status;
    public  Books(String title, String code, EnumObjects.BookStatus Sts)
    {
         this.Title = title;
        this.Code = code;
        this.Status = Sts;
    }
}
