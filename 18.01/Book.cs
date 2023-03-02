using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _18._01
{
    internal class Book : source
    {
        public string Author { get; set; }
        public string BookName { get; set; }
        public int  PageCount { get; set; }
        public string PublishingHouse { get; set; }
        public DateTime YearOfPublishing { get; set; }
        public override string GetString()
        {
            return $"Автор:{Author}\nНазвание Книги:{BookName}\nКоличество страниц:{PageCount}\nИздательство:{PublishingHouse}\nГод выпуска:{YearOfPublishing}\n";
        }
    }
}
