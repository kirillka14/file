using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _18._01
{
    internal class WebSource : source
    {
        public  string Name { get; set; }
        public  string Url { get; set; }
        public DateTime LastTimeOfInput { get; set; }
        public override string GetString()
        {
            return $"Название:{Name}\nСсылка:{Url}\nДата последнего посещения:{LastTimeOfInput}";
        }
    }
}
